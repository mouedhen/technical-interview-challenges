# Test Technique (31 point | temps ~ 420-525 min)

---

## 1. Problèmes mathématiques

### 1.1. Nombres parfaits

Les nombres parfaits sont des entiers égaux à la somme de leurs diviseurs. Par exemple 6 et 28 sont des nombres
parfaits.

```
1 + 2 + 3 = 6
1 + 2 + 4 + 7 + 14 = 28
```

Terminer la méthode `List<Integer> retrievePerfectNumbers(int)` de la classe `com.bfi.tech.MathChallenge` qui retourne
tous les nombres parfaits inférieurs à la valeur donnée.

**Exemples**

| Input  | Résultat             |
|--------|----------------------|
| 1_000  | [ 6, 28, 496 ]       |
| 10_000 | [ 6, 28, 496, 8128 ] |

### 1.2. Nombres premiers

Un nombre premier est un entier naturel qui admet exactement deux diviseurs distincts entiers et positifs. Ces deux
diviseurs sont 1 et le nombre considéré, puisque tout nombre à pour diviseur 1 et lui-même.

Terminer la méthode `List<Integer> retrievePrimeNumbers(int)` de la classe `com.bfi.tech.MathChallenge` qui retourne
tous les nombres premiers inférieurs à la valeur donnée.

**Exemples**

| Input | Résultat                                                   |
|-------|------------------------------------------------------------|
| 15    | [ 2, 3, 5, 7, 11, 13 ]                                     |
| 25    | [ 2, 3, 5, 7, 11, 13, 17, 19, 23 ]                         |
| 50    | [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 ] |

### 1.3. Somme de contrôle

Terminer la méthode `int calculateChecksum(String)` de la classe `com.bfi.tech.MathChallenge` qui effectue le
calcul suivant basé sur la position de la somme de contrôle d'un nombre de n'importe quelle longueur donnée, avec les n
chiffres modélisés par z1 à zn :

<code> z<sub>1</sub>z<sub>2</sub>z<sub>3</sub>...z<sub>n</sub> => (1*z<sub>1</sub> + 2*z<sub>2*</sub> + 3*z<sub>3</sub> + ... + n*z<sub>n</sub>) % 10</code>

**Exemples**

| Input      | Sum                                       | Résultat     |
|------------|-------------------------------------------|--------------|
| "11111"    | 1 + 2 + 3 + 4 + 5 = 15                    | 15 % 10 = 5  |
| "87654321" | 8 + 14 + 18 + 20 + 20 + 18 + 14 + 8 = 120 | 120 % 10 = 0 |

### 1.4. Chiffre Romain

#### 1.4.1. Chiffre Romain ==> Nombre Décimal

Compléter la méthode `int fromRomanToDecimal(String)` de la classe `com.bfi.tech.MathChallenge` qui détermine le nombre
décimal à partir de sa représentation romaine

#### 1.4.2. Chiffre Décimal ==> Chiffre Romain

Compléter la méthode `String fromDecimalToRoman(int)` de la classe `com.bfi.tech.MathChallenge` qui retourne la
représentation romaine d'un chiffre décimal

**Exemples**

| Représentation décimale | Représentation Romaine |
|-------------------------|------------------------|
| 17                      | "XVII"                 |
| 444                     | "CDXLIV"               |
| 1_971                   | "MCMLXXI"              |
| 2_020                   | "MMXX"                 |

## 2. Récursion

### 2.1. Conversions de nombre

#### 2.1.1. Représentation Binaire

Compléter la méthode `String toBinary(int)` de la classe `com.bfi.tech.RecursionChallenge` qui retourne la
représentation binaire textuelle du nombre entier positif en entrée.

**Exemples**

| Input | Résultat    |
|-------|-------------|
| 5     | "101"       |
| 7     | "111"       |
| 22    | "10110"     |
| 42    | "101010"    |
| 256   | "100000000" |

#### 2.1.2. Représentation Octale et Hexadécimale

Compléter les méthodes `String toOctal(int)` et `String toHex(int)` de la classe `com.bfi.tech.RecursionChallenge` qui
retourne respectivement les représentations octales et hexadécimales des nombres entiers positifs en entrées.

**Exemples**

| Input | Méthode     | Résultat |
|-------|-------------|----------|
| 5     | Octal       | "7"      |
| 7     | Octal       | "10"     |
| 22    | Octal       | "52"     |
| 42    | Hexadécimal | "F"      |
| 256   | Hexadécimal | "4D"     |

### 2.2. Puissance

#### 2.2.1. Puissance de deux

Compléter la méthode `boolean isPowerOfTwo(int)` de la classe `com.bfi.tech.RecursionChallenge` qui évalue le nombre
positif en entrée et détermine s'il est une puissance de 2.

**Exemples**

| Input | Résultat |
|-------|----------|
| 2     | true     |
| 10    | false    |
| 16    | true     |

#### 2.2.2. Exponentiel récursif

Compléter la méthode **récursive** `long powerOf(int, int)` de la classe `com.bfi.tech.RecursionChallenge` qui retourne
le premier paramètre puissance le second (les deux entiers sont toujours positifs).

**Exemples**

| Base | Puissance | Résultat |
|------|-----------|----------|
| 2    | 2         | 4        |
| 2    | 8         | 256      |
| 4    | 4         | 256      |

#### 2.2.3. Exponentiel itératif

Compléter la méthode **itérative** `long iterativePowerOf(int, int)` de la classe `com.bfi.tech.RecursionChallenge` qui
retourne le premier paramètre puissance le second (les deux entiers sont toujours positifs).

**Exemples**

| Base | Puissance | Résultat |
|------|-----------|----------|
| 2    | 2         | 4        |
| 2    | 8         | 256      |
| 4    | 4         | 256      |

### 2.3. Palindrome

Le palindrome est un mot qui se lit de la même façon dans les deux sens (de droite à gauche ou de gauche à droite).
Compléter la méthode `boolean isNumberPalindrome(int)` de la classe `com.bfi.tech.RecursionChallenge` qui détermine si
le
nombre passé en paramètre est un palindrome ou non (sans l'utilisation des fonctionnalités relatives à la classe String)
.

| Input | Résultat |
|-------|----------|
| 7     | true     |
| 13    | false    |
| 171   | true     |
| 4774  | true     |
| 47742 | false    |

### 2.4. Permutations

Déterminer toutes les permutations possibles d'une séquence de caractères donnée, pour ceci, compléter la méthode
`Set<String> retrievePermutations(String)` de la classe `com.bfi.tech.RecursionChallenge` (prendre en considération le
cas de duplications).

**Exemples**

| Input | Résultat                                 |
|-------|------------------------------------------|
| "A"   | "A"                                      |
| "AA"  | "AA"                                     |
| "AB"  | "AB", "BA"                               |
| "ABC" | "ABC", "BAC", "ACB", "CAB", "CBA", "BCA" |
| "AAC" | "AAC", "ACA", "CAA"                      |

### 2.5. Nombre d'occurrences de sous-chaînes

Compléter la méthode `int countSubstring(String, String)` de la classe `com.bfi.tech.RecursionChallenge` qui retourne le
nombre d'occurrences de la deuxième chaîne dans la première chaîne passées en paramètres. Ainsi, lorsqu'un motif est
trouvé, il doit être consommé (c'est-à-dire qu'il ne doit pas être disponible pour de nouvelles occurrences). Ceci est
montré dans le tableau suivant (les deux derniers cas).

**Exemples**

| Input     | Terme Recherché | Résultat |
|-----------|-----------------|----------|
| "xhixhix" | "x"             | 3        |
| "xhixhix" | "hi"            | 2        |
| "mic"     | "mic"           | 1        |
| "haha"    | "ho"            | 0        |
| "xxxxyz"  | "xx"            | 2        |
| "xxxxxyz" | "xx"            | 2        |

## 3. Chaînes de caractères

### 3.1. Parenthèses bien formées

Compléter la méthode `boolean checkBraces(String)` de la classe `com.bfi.tech.StringChallenge` qui vérifie si la
séquence de parenthèses transmises en tant que chaîne contient des paires de parenthèses correspondantes (correctement
imbriquées).

**Exemples**

| Input       | Résultat | Commentaires                                                                                         |
|-------------|----------|------------------------------------------------------------------------------------------------------|
| "(())"      | true     |                                                                                                      |
| "()()"      | true     |                                                                                                      |
| "()))((())" | false    | Bien que le même nombre d'accolades ouvrantes et fermées, elles ne sont pas correctement imbriquées. |
| "((()"      | false    | Les parenthèse ne sont pas bien fermées                                                              |

### 3.2. Code Morse

Compléter la méthode `String toMorseCode(String)` de la classe `com.bfi.tech.StringChallenge` qui est capable de
traduire un texte donné en caractères morse. Ceux-ci sont constitués de séquences de un à quatre tons courts et longs
par lettre, symbolisés par un point (.) ou un trait d'union (-). Pour faciliter la distinction, il est souhaitable de
placer un espace entre chaque ton et trois espaces entre chaque séquence de tons de lettres. Sinon, S (...) et EEE (...)
ne seraient pas distinguables l'un de l'autre.
Pour simplifier, limitez-vous aux lettres E, O, S, T et W avec l'encodage suivant codage suivant :

| Lettre | Code Morse |
|--------|------------|
| E      | .          |
| O      | - - -      |
| S      | ...        |
| T      | -          |
| W      | . - -      |

**Exemples**

| Input | Résultat         |
|-------|------------------|
| SOS   | "... - - - ..."  |
| TWEET | "- . - - . . -"  |
| WEST  | ". - - . ... -"  |

### 3.3. Vérification de motif (Pattern)

Écrivez la méthode `boolean matchesPattern(String, String)` de la classe `com.bfi.tech.StringChallenge` qui examine une
chaîne de caractères séparée par des espaces (deuxième paramètre) par rapport à la structure d'un motif transmis sous
forme de caractères individuels en tant que premier paramètre.

**Exemples**

| Motif  | Texte               | Résultat |
|--------|---------------------|----------|
| "xyyx" | "tim mike mike tim" | true     |
| "xyyx" | "tim mike tom tim"  | false    |
| "xyyx" | "tim mike mike tim" | false    |
| "xxxx" | "tim tim tim tim"   | true     |
