# Langage et Compilation

ChartIt

Lien vers le projet : [https://github.com/Merecy/Language-et-Compilation](https://github.com/Merecy/Language-et-Compilation)

## Modèle de domaine sous forme de diagramme de classes :

![](RackMultipart20230430-1-4jf261_html_bf8f12de61d984f8.jpg)

La syntaxe concrète sous forme de Backus-Naur (BNF) :

\<html\_generator\_program\> ::= "open(" \<file\_path\> "," "sep=" \<separator\> ");" \<create\_chart\>

\<create\_chart\> ::= "create \<name\>{" \<chart\_attributes\> "};"

\<chart\_attributes\> ::= "style=" \<chart\_style\> "," "Xaxis=" \<x\_axis\_label\> "," \<chart\_curves\>

\<chart\_curves\> ::= \<curve\> "," \<curve\>

\<curve\> ::= "curve(label\_name=" \<label\_name\> "," "legend=" \<legend\> "," "color=" \<color\> ")"

\<file\_path\> ::= \<string\_literal\>

\<separator\> ::= \<string\_literal\>

\<chart\_style\> ::= \<string\_literal\>

\<x\_axis\_label\> ::= \<string\_literal\>

\<label\_name\> ::= \<string\_literal\>

\<legend\> ::= \<string\_literal\>

\<color\> ::= \<string\_literal\>

- \<html\_generator\_program\> représente le programme qui génère du code HTML.
- \<create\> représente la création d'un graphique dans le code HTML généré.
- \<chart\_attributes\> représente les attributs du graphique, tels que le style, le libellé de l'axe des x et les courbes.
- \<chart\_curves\> représente les courbes du graphique, qui peuvent être multiples et doivent être séparées par des virgules.
- \<curve\> représente chaque courbe individuelle, qui a un nom de libellé, et peut avoir une légende et/ou une couleur.
- \<file\_path\> représente le chemin d'accès au fichier à ouvrir.
- \<separator\> représente le séparateur utilisé dans le fichier (virgule, point-virgule…).
- \<chart\_style\> représente le style graphique (line, bar, pie…).
- \<x\_axis\_label\> représente le libellé de l'axe des x.
- \<label\_name\> représente le nom de la courbe.
- \<legend\> représente la légende de la courbe.
- \<color\> représente la couleur de la courbe.
- \<string\_literal\> est une chaîne de caractère entre guillemet

## Description du langage et son implémentation :

Mon langage (.myhtml) permet de générer du code HTML qui permet d'afficher des graphiques sur une page web, à partir d'un fichier CSV.

Pour utiliser mon langage, on peut utiliser deux types d'instruction, " **open**" et " **create**".

L'instruction " **open**" permet d'indiquer le chemin du fichier CSV à utiliser. On peut également spécifier le séparateur au besoin.

L'instruction " **create**" permet de créer un graphique, à laquelle on peut définir la donnée à utiliser sur l'axe des abscisses, le type de graphique et les courbes que l'on veut.

Chaque courbe est définie par l'instruction " **curve**" qui permet de créer une courbe sur un type de données en particulier, mais on peut également mettre une légende, ou changer la couleur de cette dernière.

## Description simple du compilateur afin d'obtenir la page html:

Notre compilateur va dans un premier temps récupérer le chemin vers le CSV, ainsi que son séparateur si spécifié. Il va également récupérer les labels des colonnes qu'il va devoir utiliser pour l'axe des abscisses et des courbes.

Le programme va ensuite lire le CSV, et récupérer uniquement les informations dont il a besoin, et tout mettre dans une variable data, de façon formaté pour chartjs.

Il va ensuite assembler l'HTML en prenant en compte les options du graphique (le style, les légendes, la couleur), et la data extraite juste avant.

Il faut également noter que dans les données dans le fichier généré seront uniquement les données demandées, si votre fichier csv contient des informations sensibles, telles que des adresses mail, des numéros de téléphone, etc, ces dernières ne seront pas visible dans le code source de l'html.

Le compilateur est également prévu pour émettre une erreur custom, si le fichier csv ou les arguments de colonne de csv n'existe pas (par faute de typo par exemple).

## **Exemple de scénario :**

Exemple 1)

On veut représenter avec un graphique en barre, la puissance moteur de chaque voiture.
```
html\_generator\_program{

  open("\<path\>/cars.csv");

    create chart{

      style=bar,

      Xaxis="Car",

      curve(label\_name="Horsepower", legend="Horsepower")

    };

}
```
Exemple 2)

On veut représenter cette fois ci, une comparaison entre la population et le nombre de téléphones portables de chaque pays.
```
html\_generator\_program{

  open("\<path\>/factbook.csv",sep=";");

    create chart{

      style=line,

      Xaxis="Country",

      curve(label\_name="Population", legend="Population", color=pink),

      curve(label\_name="Telephones - mobile cellular", legend="Cellular", color=blue)

    };

}
```
## Son usage principal et l'ensemble de ses fonctionnalités :

Mon langage permet de créer de manière simple un graphique sur un fichier HTML.

Voici l'ensemble de ses fonctionnalités :

- Vérification du CSV (si le fichier existe ou non), avec une erreur custom qui indique si le fichier n'existe pas.
- Modification de la valeur séparatrice du CSV au besoin.
- Choix possible entre plusieurs styles de graphique (barre, donut, ligne, radar, pie).
- Auto proposition pour le choix des styles.
- Choix de l'argument des axes abscisses.
- Auto vérification des arguments, avec erreur custom (vérifie si l'argument est bien une colonne dans le csv) et indique quel paramètre a une erreur.
- Choix des courbes, qui peuvent être multiples (avec choix des arguments, de la légende, et de la couleur)
- Auto proposition des choix de couleur pour les courbes.
- Conserve dans l'HTML uniquement les arguments demandés.
- Génération de fichier en conservant le nom de base (fichier1.myhtml -\> fichier1.html)
- Auto gestion des noms des arguments pouvant influer sur chartjs (modification des espaces, des parenthèses par des underscores).
- Auto gestion des champs des arguments permettant d'être plus souple dans l'écriture de ces derniers (accepte les espaces, caractère spéciaux tels que les #).
