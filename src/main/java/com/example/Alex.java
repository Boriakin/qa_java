package com.example;

import java.util.List;

public class Alex extends Lion {
    private final List<String> alexFriendsList = List.of("Марти", "Мелман", "Глория");
    private final String alexPlaceOfLiving = "Нью-Йоркский зоопарк";

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return alexFriendsList;
    }

    public String getPlaceOfLiving() {
        return alexPlaceOfLiving;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
