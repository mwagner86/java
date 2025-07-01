import random
import math

def power(base, exp, mod):
    """
    Berechnet (base^exp) % mod effizient.
    Nutzt Pythons eingebaute pow()-Funktion für Modular Exponentiation.
    """
    if exp < 0:
        raise ValueError("Negative Exponenten nicht direkt unterstützt (modulares Inverses benötigt).")
    if mod <= 0:
        raise ValueError("Modulus muss positiv sein.")
    # Python's pow(basis, exponent, modulus) ist bereits optimiert
    return pow(base, exp, mod)

def is_prime_miller_rabin(n, k=40):
    """
    Führt den Miller-Rabin Primzahltest mit k Runden durch.

    Args:
        n: Die zu testende ganze Zahl.
        k: Die Anzahl der Testrunden (Sicherheitsparameter, Default 40).

    Returns:
        True, wenn n nach k Runden wahrscheinlich prim ist.
        False, wenn n sicher zusammengesetzt ist.
    """
    # Behandle Basisfälle und kleine Zahlen
    if n < 2:
        return False
    if n == 2 or n == 3:
        return True
    # Prüfe auf gerade Zahlen (außer 2)
    if n % 2 == 0:
        return False

    # Schritt 1: Schreibe n - 1 = d * 2^j, wobei d ungerade ist
    d = n - 1
    j = 0
    while d % 2 == 0:
        d //= 2 # Ganzzahlige Division
        j += 1

    # Schritt 2: Führe k Runden des Tests durch
    for _ in range(k):
        # Wähle eine zufällige Basis a im Bereich [2, n - 2]
        # Wichtig: random.randint ist inklusiv an beiden Grenzen
        a = random.randint(2, n - 2)

        # Berechne x = a^d mod n
        x = power(a, d, n)

        # Wenn x == 1 oder x == n - 1, ist der Test für dieses a bestanden
        if x == 1 or x == n - 1:
            continue # Nächste Runde mit neuem a

        # Überprüfe die Quadrate: a^(d*2^r) mod n für r = 1 bis j-1
        # Wenn keiner dieser Werte -1 mod n ergibt, ist a ein Zeuge
        is_witness = True # Annahme: a ist ein Zeuge
        for _ in range(j - 1): # r geht von 1 bis j-1
            x = power(x, 2, n) # Quadriere das vorherige Ergebnis
            if x == n - 1:
                # Bedingung a^(d*2^r) == -1 mod n erfüllt
                is_witness = False # Doch kein Zeuge
                break # Innere Schleife für dieses a beenden
            if x == 1:
                # Wenn 1 erreicht wird, bevor -1 erreicht wurde, ist n sicher zusammengesetzt
                # da wir eine nichttriviale Wurzel von 1 gefunden haben.
                return False # a ist definitiv ein Zeuge

        if is_witness:
            # Wenn die innere Schleife durchlief, ohne dass x == n-1 wurde,
            # und der ursprüngliche x (a^d) auch nicht 1 oder n-1 war,
            # dann ist a ein Zeuge.
            return False # n ist sicher zusammengesetzt

    # Wenn nach k Runden kein Zeuge gefunden wurde
    return True # n ist wahrscheinlich prim

# ---- Hauptteil des Skripts ----
if __name__ == "__main__":
    # Die Zahl X aus der Übung
    M = 20244562
    X = 6 * M + 1
    print(f"Teste Zahl X = 6 * {M} + 1 = {X} auf Primalität...")

    # Anzahl der Testrunden (kann erhöht werden für höhere Sicherheit)
    # 40 Runden sind für die meisten Zwecke mehr als ausreichend.
    num_rounds = 40

    is_likely_prime = is_prime_miller_rabin(X, num_rounds)

    print("-" * 40)
    if is_likely_prime:
        print(f"Ergebnis Miller-Rabin Test ({num_rounds} Runden): X = {X} ist wahrscheinlich prim.")
    else:
        print(f"Ergebnis Miller-Rabin Test ({num_rounds} Runden): X = {X} ist sicher zusammengesetzt.")

    print("-" * 40)
    print("Hinweis:")
    print("Der Miller-Rabin-Test ist probabilistisch. Die Wahrscheinlichkeit, dass eine")
    print("zusammengesetzte Zahl nach 40 Runden fälschlicherweise als 'wahrscheinlich prim'")
    print(f"eingestuft wird, ist extrem gering (kleiner als (1/4)^{num_rounds}).")
    print("Ein 'False'-Ergebnis bedeutet immer 'sicher zusammengesetzt'.")