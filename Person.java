public class Person {
    private String name;
    private String friendList;

    public Person(String name) {
        this.name = name;
        this.friendList = name;
    }

    public String getFriends() {
        return friendList;
    }

    public void befriend(Person p) {
        friendList += ", " + p.name;
    }

    public void unfriend(Person p) {
        friendList = friendList.replace(", " + p.name, "");
    }
}