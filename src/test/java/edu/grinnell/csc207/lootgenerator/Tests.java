package edu.grinnell.csc207.lootgenerator;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.lootgenerator.LootGenerator.BaseItem;
import edu.grinnell.csc207.lootgenerator.LootGenerator.Item;
import edu.grinnell.csc207.lootgenerator.LootGenerator.Monster;

public class Tests {
    @Test
    @DisplayName("pickMonster() Test")
    public void pickMonsterTest() throws FileNotFoundException {
        LootGenerator gen = new LootGenerator();
        ArrayList<Monster> mlist = new ArrayList<>();
        Monster m1 = new Monster("SoulKiller", "Fetish", "23", "Act 3 H2H B");
        Monster m2 = new Monster("Urdar", "PinHead", "32", "Act 4 H2H A");

        mlist.add(m1);
        mlist.add(m2);

        Monster picked = gen.pickMonster(mlist);

        assertTrue(mlist.contains(picked));
    }

    @Test
    @DisplayName("try1000lootDrops() Test")
    public void try1000lootDropsTest() throws FileNotFoundException {
        LootGenerator gen = new LootGenerator();

        for (int i = 0; i < 1000; i++) {
            Monster monster = gen.pickMonster(gen.monsters);
            BaseItem baseItem = gen.getTC(monster, gen.TCmap, gen.baseMap);

            baseItem = gen.getBaseStats(baseItem);

            Item modItem = new Item(baseItem);
            gen.getAffix(modItem);

            assertTrue(baseItem.defense >= 0);
        }
    }
}

    // @Property(tries=100)
    // @DisplayName("getTC() Property Test")
    // void getTCpropertyTest() throws FileNotFoundException {
    //     LootGenerator gen = new LootGenerator();
    //     Monster m = gen.pickMonster(gen.monsters);

    //     assertTrue(gen.getTC(m, gen.TCmap, gen.baseMap));
    // }


// @Property
//     public boolean examplePropertyTest(
//             @ForAll @IntRange(min = 1, max = 1000) int sz,
//             @ForAll int k) {
//         int[] arr = new int[sz];
//         for (int i = 0; i < sz; i++) {
//             arr[i] = k;
//         }
//         return Functions.thirdGreatest(arr) == k;
//     }
