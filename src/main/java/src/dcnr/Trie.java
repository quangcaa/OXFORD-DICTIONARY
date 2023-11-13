package src.dcnr;

import java.util.ArrayList;
import java.util.List;

class TrieNode {
    private static final int apb = 28; // 'a'->'z' (0-25) , ' ' (26) , '-' (27)
    private TrieNode[] trieNode = new TrieNode[apb];
    private int end;
    private String word;

    TrieNode() {
        for (int i = 0; i < apb; i++) {
            trieNode[i] = null;
        }
        end = 0;
        word = "";
    }

    public TrieNode[] getTrieNode() {
        return trieNode;
    }

    public void setTrieNode(TrieNode[] trieNode) {
        this.trieNode = trieNode;
    }

    public int isEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

public class Trie {
    private static TrieNode root = new TrieNode();

    public Trie() {
    }

    public static void insert(String word) { // inserts a word into the trie
        try{
            TrieNode current = root;

            word = word.toLowerCase();

            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (index == -65) index = 26;
                else if (index == -52) index = 27;

                if (current.getTrieNode()[index] == null) {
                    current.getTrieNode()[index] = new TrieNode();
                }

                current = current.getTrieNode()[index];
            }

            current.setEnd(1);
            current.setWord(word);
        } catch(Exception e){
            System.out.println(e.toString());
        }

    }

    public boolean search(String word) { // searches for a word in the trie
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (index == -65) index = 26;
            else if (index == -52) index = 27;

            if (current.getTrieNode()[index] == null) {
                return false;
            }

            current = current.getTrieNode()[index];
        }

        return current != null && current.isEnd() == 1;
    }

    public void fixWord(String before, String after) {
        delete(before);
        insert(after);
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }

    public List<String> getAllWords() {
        List<String> words = new ArrayList<>();
        getAllWordsFromNode(root, words);
        return words;
    }

    private void getAllWordsFromNode(TrieNode node, List<String> words) {
        if (node.isEnd() == 1) {
            words.add(node.getWord());
        }

        for (int i = 0; i < node.getTrieNode().length; i++) {
            TrieNode child = node.getTrieNode()[i];

            if (child != null) {
                getAllWordsFromNode(child, words);
            }
        }
    }

    public List<String> findWordsWithPrefix(String prefix) { // returns a list of words with the given prefix
        List<String> words = new ArrayList<>();

        TrieNode prefixNode = findPrefixNode(prefix);
        if (prefixNode != null) {
            findWordsFromNode(prefixNode, prefix, words);
        }

        return words;
    }

    private TrieNode findPrefixNode(String word) { // helper of findWordsWithPrefix function
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (index == -65) index = 26;
            else if (index == -52) index = 27;

            if (current.getTrieNode()[index] == null) {
                return null;
            }

            current = current.getTrieNode()[index];
        }

        return current;
    }

    private void findWordsFromNode(TrieNode node, String prefix, List<String> words) // helper of findWordsWithPrefix function
    {
        if (node.isEnd() == 1) {
            words.add(prefix);
        }

        for (int c = 0; c < 28; c++) {
            int index = c;
            TrieNode child = node.getTrieNode()[index];

            char z = (char) ((int) 'a' + index);
            if (index == 26) z = ' ';
            else if(index == 27) z = '-';

            if (child != null) {
                findWordsFromNode(child, prefix + z, words);
            }
        }
    }

    private boolean delete(TrieNode node, String word, int depth) {
        if (depth == word.length()) {
            if (node.isEnd() == 1) {
                node.setEnd(0);
                node.setWord("");
            }

            return isEmpty(node);
        }

        int index = word.charAt(depth) - 'a';
        if (index == -65) index = 26;
        else if (index == -52) index = 27;
        TrieNode child = node.getTrieNode()[index];
        if (child == null) {
            return false;
        }

        boolean deleteChild = delete(child, word, depth + 1);
        if (deleteChild) {
            node.getTrieNode()[index] = null;
            return isEmpty(node);
        }

        return false;
    }

    private boolean isEmpty(TrieNode node) { // helper to check if a node has no trieNode(children)
        for (TrieNode child : node.getTrieNode()) {
            if (child != null) return false;
        }
        return true;
    }

}
