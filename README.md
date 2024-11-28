User Interface App by Lucas - Grégoire - Iles

Une application Android simple pour démontrer les concepts suivants :

Navigation Drawer : Menu latéral pour naviguer entre différentes activités.
RecyclerView : Affichage d'une liste d'éléments (livres).
Mode Jour/Nuit : Basculement dynamique entre les thèmes clair et sombre.
Easter Egg : Fonctionnalité cachée accessible via le menu.
Fonctionnalités
1. Navigation Drawer
   Un menu latéral intégré permettant de naviguer facilement entre :

Main Activity (Écran principal).
Second Activity (Affichage d'une liste de livres avec RecyclerView).
Easter Egg (Un écran spécial avec un message de félicitations).
2. RecyclerView
   Dans la SecondActivity, une liste de livres est affichée avec :

Le titre.
L'auteur.
3. Mode Jour/Nuit
   Un bouton dans l'écran principal permet de basculer entre :

Mode clair.
Mode sombre.
Les préférences de thème sont sauvegardées et appliquées automatiquement au redémarrage de l'application.

4. Easter Egg
   Accessible via le menu latéral, cette fonctionnalité montre un écran spécial avec un message amusant et une image.

Structure du Projet
Principaux fichiers :
MainActivity.kt : Écran principal avec le menu latéral et les boutons.
SecondActivity.kt : Affiche une liste de livres dans un RecyclerView.
SecretActivity.kt : Écran spécial pour l'Easter Egg.
Ressources importantes :
res/menu/nav_menu.xml : Définit les options du menu latéral.
res/layout/activity_main.xml : Mise en page principale.
res/layout/activity_second.xml : Mise en page avec RecyclerView.
res/layout/activity_secret.xml : Mise en page de l'écran de l'Easter Egg.
res/values/themes.xml et themes-night.xml : Gestion des thèmes Jour/Nuit.
Comment utiliser l'application
Écran principal :

Cliquez sur "Passer à la prochaine activité" pour accéder à la liste des livres.
Cliquez sur "Changer le mode" pour basculer entre les thèmes jour et nuit.
Ouvrez le menu latéral en cliquant sur l'icône du menu dans la barre d'outils.
Menu latéral :

Sélectionnez "Main Activity" pour revenir à l'écran principal.
Sélectionnez "Second Activity" pour voir la liste des livres.
Sélectionnez "Easter Egg" pour accéder à l'écran caché.
Pré-requis
Android Studio 4.0 ou plus récent.
API minimale : 24 (Android 7.0 Nougat).
API cible : 34 (Android 14).
Installation
Clonez le dépôt ou téléchargez les fichiers.
bash
Copier le code
git clone <repository-url>
Ouvrez le projet dans Android Studio.
Synchronisez les dépendances Gradle.
Exécutez l'application sur un émulateur ou un appareil physique.
Aperçu de l'application
Écran principal :
Un texte d'accueil.
Deux boutons : passer à l'activité suivante et changer le mode.
Liste de livres :
Affiche le titre et l'auteur des livres.
Easter Egg :
Un écran spécial avec un message de félicitations.
