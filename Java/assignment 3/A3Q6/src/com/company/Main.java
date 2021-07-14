package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //HashMap<Integer,String> chatRoom = new HashMap<>();
        ArrayList<ChatRoom > chatRoom = new ArrayList<>();
        ChatRoom dflt = new ChatRoom("default");
        ChatRoom funny = new ChatRoom("funny");
        ChatRoom joke= new ChatRoom("jokes");

        chatRoom.add(dflt);
        chatRoom.add(funny);
        chatRoom.add(joke);

        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(new User("adsd","asdasd"));

        usersList.add(new User("hp","213dss"));

        usersList.add(new User("ad22","123ad"));
        dflt.setUsers(usersList);

        ArrayList<String> dmsgs = new ArrayList<>();
        dmsgs.add("hey");
        dmsgs.add("hello");
        dmsgs.add("asdad");


        HashMap<ChatRoom,String> userAdd = new HashMap<>();

      /*  List<User> usersList = new ArrayList<>();
        usersList.add(new User("hp","123"));*/


        Scanner sc = new Scanner(System.in);
        String opt;
        String roomName="default";
        boolean notExt=true;
        do {
            System.out.println("Enter option A,B,C,D,E,F,G,H,I or end to exit.");
            opt=sc.nextLine();
            switch (opt){
                case "A":
                    System.out.println("Enter new chatroom name");
                    roomName=sc.nextLine();
                    chatRoom.add(new ChatRoom(roomName));
                    break;
                case "B":
                    System.out.println("Add user to chatroom: ");
                    System.out.println("Enter username: ");
                    String user;
                    String room;
                    user=sc.nextLine();
                    userAdd.put(new ChatRoom(roomName),user);
                    System.out.println("User "+ user + " added to room: "+ roomName);
                    break;

                case "C":
                    System.out.println("User Login: ");
                    String id,pass;
                    System.out.println("Enter id: ");
                    id=sc.nextLine();
                    System.out.println("Enter pass: ");
                    pass=sc.nextLine();
                    for (User users: usersList){
                        if (users.getId().equals(id)&& users.getPass().equals(pass)){
                            System.out.println("USER LOGGED IN");
                        }
                    }
                    break;
                case "D":
                    System.out.println("Send a msg: ");
                    ArrayList<String> msg = new ArrayList<>();
                    msg.add(sc.nextLine());
                    dflt.setMsgs(msg);
                    break;

                case "E":
                  /*  System.out.println("Enter chatroom name to see msgs");
                    String chtrm;
                    chtrm=sc.nextLine();*/
                 //   if (rm.name.eq)
                    dflt.getMsgs().stream().forEach(System.out::println);
                    break;

                case "F":
                    System.out.println("Users in default chat");
                    for (User x: dflt.getUsers()){
                        System.out.println(x.getId());
                    }
                    break;
                case "G":
                    System.out.println("Logged out");
                    notExt=false;
                    break;

                case "H":
                    System.out.println("Enter user to delete");
                    String dltuser =sc.nextLine();
                    for (User x: usersList){
                        if (x.getId().equals(dltuser)){
                            usersList.remove(x);
                            System.out.println("User deleted.");
                        }
                    }
                    break;

                case "I":
                    System.out.println("Enter room to delete");
                    String dltroom =sc.nextLine();

                    for (ChatRoom x: chatRoom){
                        if (x.getName().equals(dltroom)){
                            chatRoom.remove(x);
                            System.out.println("Chat room: "+ dltroom + " deleted.");
                        }
                    }
                    break;
                case "end":
                    notExt=false;

            }
        }
        while(notExt);
    }
}
