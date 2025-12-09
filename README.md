# Project: Text Adventure

Author: Z Schwab

## Resources

 *  Starting code and instructions from CSC207 [course site](https://osera.cs.grinnell.edu/ttap/data-structures-labs/text-adventure.html) taught by PM Osera
 *  Game instructions inspired by the instructions for the text adventure [Galatea](https://www.web-adventures.org/cgi-bin/webfrotz?s=Galatea&n=27898) by Emily Short
 *  Regex for reading in files constructed with help of [regex101.com](regex101.com)
 *  Javadocs consulted for [Scanner](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html) class, [Pattern](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html) class
 *  Claude Sonnet 4.5 used to parse through my very un-organized half-planned TTRPG campaign notes and dig up the most encapsulable storylines
 *  Compiled with openjdk 21.0.8
 *  Written in the Java programming language

## Revision Log

commit 41834f42e52da7b063b3a6dfacc6ffd13bc1ecde (HEAD -> main, origin/main, origin/HEAD)
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:32:15 2025 -0600

    my christmas gift to myself is no unit testing

commit 8f9373e1dfb7ae023c7489b5b450fefd3674822f
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:26:45 2025 -0600

    added story lines

commit 22a60402f4b00089b38244d7d90748ed59b26fe0
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:26:04 2025 -0600

    fixed constructor bug

commit f38d80b40707ff9e6d3e5d065bfc44f54cf20c30
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:25:39 2025 -0600

    rewrote game loop handling to work with new Room method, cleaned up logic

commit 19cbaf3f29854f5c30fafc5611f88110529bd111
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:24:58 2025 -0600

    added keyBuilder from superclass

commit 87a3e3c39742fbce0ca9af54e8f3f42ab003fae6
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:24:26 2025 -0600

    added method to build key from action object for easier lookups

commit a09fb6862b58d40b5f7f3e87b0e07e237b6f5e24
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 20:23:35 2025 -0600

    removed Commands.java, shifted logic to Room.java

commit 4b001c106c8c49a94123e7db06804c82ba9e0fae
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Mon Dec 8 18:26:04 2025 -0600

    separated abstract class extensions into their own files

commit 40ed25bee75b51dfae8eee762db8801800bd60b7
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 21:36:02 2025 -0600

    readme updated with more citations

commit 1d54c6e86bc14735ab206586c5de3f73eaf752c2
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 21:19:07 2025 -0600

    restructured room to be an abstract class

commit df9f60d1cb72a3e0acb26666481dc3a69dbc2e0c
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 21:02:29 2025 -0600

    initial datafile commit

commit 15be18674c360cc1950a26652474e03fc9b8049b
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 21:01:11 2025 -0600

    made class for tracking gamestate globally

commit e4255ad1981c64cbc846b5d84d28601b255a366a
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 20:54:17 2025 -0600

    initial commit

commit 0053d36106faff3fbdb911c118ee00361c656716
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Dec 7 17:38:41 2025 -0600

    fixed parser input handling for too short msgs

commit 2a0100b4e623b1cfbc8bdf46e227bc147cbf33f9
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sat Dec 6 21:28:17 2025 -0600

    added condition object

commit a5221b1713f9f3d2acff6d9f3f93633fda10409a
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sat Dec 6 21:27:41 2025 -0600

    implemented interface for rooms

commit a79ce2d65dc85c71c1f04a9a1bb9b15a719e7148
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Dec 3 22:07:14 2025 -0600

    made room interface, implemnted for two rooms

commit d0c32efd6bd501bced55dabeee5e06f777a639e9
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Dec 3 15:37:40 2025 -0600

    simple parser of verb,subject pairs created

commit fdfc7636b3e52a28907e1ef7c28b02e52f6f02bb
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Dec 3 13:11:07 2025 -0600

    initial datafile commit

commit f9a069aa78c5d90fbf42fcd5bd53d1c43295aa31
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Dec 3 11:08:27 2025 -0600

    switched inventory from arraylist to hashmap

commit 65ff2707de9e80fae928fd69f39897d34fc2915d
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Dec 3 10:46:40 2025 -0600

    initial commit

commit 83b0e58017025a115e4006bd973031a651620c43
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 19:36:37 2025 -0600

    set up basic game loop with intro and help menu

commit 0232a2e7a5ab5db2e6ec4a70ba9018f6687b9228
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 19:20:14 2025 -0600

    readme updated to include instructions credit

commit 8e4ea63329c995f371dd40e5854c8eea0b3504c6
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 17:14:08 2025 -0600

    set up basic classes

commit 79b6298a77a8a90c469f1a0282ed2879d69b310c
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 17:13:40 2025 -0600

    set up type for player info

commit 1e0c1c5b0d72db7cdb2559416efb91a73ed75c75
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 16:54:47 2025 -0600

    initial commit

commit 4751fcd5791274813071fbcc2ec73813bcd60e54
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Sun Nov 30 16:42:12 2025 -0600

    updated README

commit 884ab677700461d25cfce7e677579ccddd58bebe
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 28 12:53:06 2025 -0600

    updated .gitignore

commit c657f7c6fff7802cd188203a178965bae77e2803
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 28 12:51:37 2025 -0600

    Remove .DS_Store files

commit 87c01da1e96a832e42b47e0a71702a381df66cee
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 28 12:49:15 2025 -0600

    Remove .DS_Store files

commit 6fcfb024e22184cc7a45c9d9f09a449dd2b9a389
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 28 12:42:19 2025 -0600

    initial class file commits

commit e2fd00b00d0900f083b16ac8b7536f64dafd876f
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 28 12:34:42 2025 -0600

    initial commit
