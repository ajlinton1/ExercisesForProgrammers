package com.andrewlinton.makingDecisions;

public class TroubleshootingCarIssues {

    Node root;

    public static void main(String[] args) {
        TroubleshootingCarIssues troubleshootingCarIssues = new TroubleshootingCarIssues();
        troubleshootingCarIssues.troubleshoot();
    }

    public TroubleshootingCarIssues() {
        buildTree();
    }

    void buildTree() {
       Node node = new Node("Is your car silent when you turn the key?");
       root = node;
       node.yes = new Node("Are your battery terminals corroded?");
       node.yes.yes = new Node("Clean the terminals and try starting again");
       node.yes.no = new Node("Replace the cables");

       node.no = new Node("Does the car make a clicking sound?");
       node.no.yes = new Node("Replace the battery");
       node.no.no = new Node("Does the engine start and then die?");
       node.no.no.yes = new Node("Does your car have fuel injection");
       node.no.no.yes.no = new Node("Check the chock");
       node.no.no.yes.yes = new Node("Bring to shop");
    }

    void troubleshoot() {
        troubleshoot(root);
    }

    void troubleshoot(Node node) {
        System.out.print(node.text);
        if (node.yes==null && node.no==null) {
            return;
        }
        String response = InputHelper.getString();
        if (response.toLowerCase().startsWith("y")) {
            if (node.yes!=null) {
                troubleshoot(node.yes);
            }
        } else if (response.toLowerCase().startsWith("n")) {
            if (node.no!=null) {
                troubleshoot(node.no);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return;
    }

    class Node {
        public String text;
        public Node yes,no;

        public Node(String text) {
            this.text = text;
        }
    }

}
