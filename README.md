# Project: Loot Generator

Authors: Z Schwab

## Resources

 *  Starting code and instructions from CSC207 [course site](https://osera.cs.grinnell.edu/ttap/data-structures-labs/loot-generator.html) taught by PM Osera
 * javadocs on the [Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html) class
 * javadocs on the [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) class
 * oracle guide to java code conventions for [file organization](https://www.oracle.com/java/technologies/javase/codeconventions-fileorganization.html)
 * [junit Assert](https://docs.junit.org/5.0.1/api/org/junit/jupiter/api/Assertions.html)
 * [jqwik property tests](https://jqwik.net/docs/current/user-guide.html#writing-properties) for learning how to run property tests for a fixed number of iterations
 *  Compiled with openjdk 21.0.8
 *  Written in the Java programming language

## Revision Log

commit 5ef4189a04824e8320591f622bd3d2f03a5e04c0 (HEAD -> main, origin/main, origin/HEAD)
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 16:04:54 2025 -0600

    added logic for burntesting, commented it out

commit ded1c99ab2b93438ae43974a449361bdd4cd9b6f
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 16:04:23 2025 -0600

    wrote burntest, ran successfully

commit b4038d9d86d715c388c318943f1d99c7e0fc7869
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 04:08:04 2025 -0600

    wrote tests for pickMonster and letting lootdrops run

commit 20ccbd191a3b63be42454a33cf28cdf1e38e6a0a
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 03:50:22 2025 -0600

    added jqwik doc credit

commit 0cb046e3348720adfe1d59f4610245035545c3f0
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 03:32:54 2025 -0600

    added junit doc credit

commit fa50df1f56e3d55b0a6e22c003dadcf277ed8d93
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 03:01:25 2025 -0600

    updated credited docs in readme

commit fabd84a8728bfde8c9d74416c756cba463f2ed04
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 02:57:00 2025 -0600

    reorganized file object order to fit convention

commit bc0eb23167c0bb4fcd4f2dcc3044dd9ac22fba4e
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 02:51:38 2025 -0600

    added javadocs to methods

commit 74075cd9c852c1e8da5f0029c1635f78f99e6c55
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 02:23:11 2025 -0600

    fixed user input loop logic

commit 8b814c5f393e4c269bafb69d604e60bad0611616
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 02:03:17 2025 -0600

    wrote game loop logic

commit ccf4720b209b101394419281c22b16f407e99128
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Fri Nov 14 01:45:25 2025 -0600

    added name class for modded item, wrote getAffix method

commit 55ec7163195493e76543ea3f1b809373301631f2
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 21:22:06 2025 -0600

    wrote methods to get data and forgot to commit for a while oops

commit bb6272cc89382fd5a5be5d8dfb317a281a5b9c32
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 18:35:33 2025 -0600

    finished writing load methods

commit 37743e859ebc2e1b26af6ac4484f73fa19829223
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 17:40:36 2025 -0600

    wrote method to load TCs with hashmap

commit 5defb13e8d5297e8fe3e862eee37639566a87592
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 11:53:31 2025 -0600

    wrote method to load monsters from monstats

commit e2806f7620aca7d6cf0a2d67a63bd11465ccd589
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 22:43:30 2025 -0600

    added constructors for each object

commit 71a18ebeeb39d3ec51c4c79ebab5f5faf01dcdbf
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 19:16:18 2025 -0600

    defined all classes

commit 28384cccf923bde30923efc73872ca7b94c0c900
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 18:20:47 2025 -0600

    updated README

commit b5551e9aaf56850583b73ed93fef19dc98bc03f5
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Sun Apr 6 16:41:00 2025 -0500

    project files

commit 192fcf589e86432a004a47a9cc3118264b894225
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Sun Apr 6 16:40:56 2025 -0500

    initial commit
(END)
commit 37743e859ebc2e1b26af6ac4484f73fa19829223
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 17:40:36 2025 -0600

    wrote method to load TCs with hashmap

commit 5defb13e8d5297e8fe3e862eee37639566a87592
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Thu Nov 13 11:53:31 2025 -0600

    wrote method to load monsters from monstats

commit e2806f7620aca7d6cf0a2d67a63bd11465ccd589
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 22:43:30 2025 -0600

    added constructors for each object

commit 71a18ebeeb39d3ec51c4c79ebab5f5faf01dcdbf
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 19:16:18 2025 -0600

    defined all classes

commit 28384cccf923bde30923efc73872ca7b94c0c900
Author: Z Schwab <zbajraktarischwab@gmail.com>
Date:   Wed Nov 12 18:20:47 2025 -0600

    updated README

commit b5551e9aaf56850583b73ed93fef19dc98bc03f5
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Sun Apr 6 16:41:00 2025 -0500

    project files

commit 192fcf589e86432a004a47a9cc3118264b894225
Author: Peter-Michael Osera <osera@cs.grinnell.edu>
Date:   Sun Apr 6 16:40:56 2025 -0500

    initial commit
