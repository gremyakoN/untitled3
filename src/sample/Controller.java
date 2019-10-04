package sample;

import java.util.HashSet;
import static org.junit.Assert.*;
public class HashSetDemoTest {
    HashSet<String> hashSet;
    HashSet<String> clonedHashSet;
    @org.junit.jupiter.api.Test
    public void test (){
        hashSet= newHashSet<String>();
        hashSet.add("Славянская Елена");hashSet.add("Левандовская Анна");hashSet.add("Владова Алина");hashSet.add("Поплавская Эльвира");hashSet.add("Воронцова Наталья");hashSet.add("Южная Елизавета");for (String s : hashSet) {System.out.println(s);
    }
}