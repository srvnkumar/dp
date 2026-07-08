package org.example;

//Concrete Collection
public class NameCollection implements MyCollection<String> {

    private final String[] names = {"Alice","Bob","Charlie","David"};

    @Override
    public MyIterator<String> iterator() {
        return new NameIterator();
    }
    private class NameIterator implements MyIterator<String>{

        private int index = 0;
        @Override
        public String next() {
            return names[index++];
        }

        @Override
        public boolean hasNext() {
            return index < names.length;
        }
    }
}
