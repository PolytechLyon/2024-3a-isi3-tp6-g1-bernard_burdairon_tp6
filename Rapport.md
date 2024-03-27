# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : \
BERNARD Alban \
BURDAIRON Florian

## Exercice 1
Le patron de conceptions mis en place s'appelle "Composite".
Ici, `MobileObject` est le composant et `Vehicle` est le composite.
Ce dernier contiendra des objets implémentant l'interface MobileObject.

Comme les méthodes `getVelocity()` et `getMass()` est déjà définie dans `Vehicle`, 
il n'y a pas besoin de la récrire dans chaque classe implémentant `Vehicle`.

## Exercice 2
Le patron de conception utilisé pour parcourir les composants d'un véhicule dans la méthode `getVelocity()` est le patron de conception "Iterator".
Il permet de parcourir les éléments d'une collection sans exposer la structure interne de la collection.

Celui-ci permet donc de remplacer la structure de donnée utilisée pour stocker les composants d'un véhicule de `Set` à `List` sans modifier la réalisation de la méthode `getVelocity()`.

## Exercice 3

Pour utiliser le patron de conception singleton, il faut :
- Déclarer un attribut statique privé de la classe `Clock`, ici nommé `instance`, qui contiendra l'instance unique de la classe.
- Déclarer un constructeur privé pour empêcher l'instanciation de la classe.
- Déclarer une méthode statique publique qui retourne l'instance unique de la classe ou qui l'instancie si elle n'existe pas.

## Exercice 4

## Exercice 5

## Exercice 6

## Exercice 7

## Exercice 8


