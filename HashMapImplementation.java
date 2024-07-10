//package Arrays;
//import java.util.*;
//
//class HashMapFinal{
//    ArrayList<LinkedList<Entity>> list;
//
//    private int size = 0;
//
//    private float lf = 0.5f;
//
//    public HashMapFinal() {
//        list = new ArrayList<>();
//        for(int i=0; i < 10; i++) {
//            list.add(new LinkedList<>());
//        }
//    }
//
//    public void put(K key, V value) {
//        int hash = Math.abs(key.hashCode() % list.size());
//
//        LinkedList<Entity> entities = list.get(hash);
//
//        for (Entity entity : entities) {
//            if(entity.key.equals(key)) {
//                entity.value = value;
//                return;
//            }
//        }
//
//        if((float)(size) / list.size() > lf) {
//            reHash();
//        }
//
//        entities.add(new Entity(key, value));
//
//        size++;
//    }
//
//    private void reHash() {
//        System.out.println("We are now rehashing!");
//
//        ArrayList<LinkedList<Entity>> old = list;
//        list = new ArrayList<>();
//
//        size = 0;
//
//        for(int i=0; i<old.size() * 2; i++) {
//            list.add(new LinkedList<>());
//        }
//
//        for(LinkedList<Entity> entries :old) {
//            for(Entity entry : entries) {
//                put(entry.key, entry.value);
//            }
//        }
//    }
//
//    public V get(K key) {
//        int hash = Math.abs(key.hashCode() % list.size());
//        LinkedList<Entity> entities = list.get(hash);
//        for(Entity entity : entities) {
//            if(entity.key.equals(key)) {
//                return entity.value;
//            }
//        }
//        return null;
//    }
//
//    public void remove(K key) {
//        int hash = Math.abs(key.hashCode() % list.size());
//        LinkedList<Entity> entities = list.get(hash);
//
//        Entity target = null;
//
//        for(Entity entity : entities) {
//            if(entity.key.equals(key)) {
//                target = entity;
//                break;
//            }
//        }
//
//        entities.remove(target);
//        size--;
//    }
//
//    public boolean containsKey(K key) {
//        return get(key) != null;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("{");
//        for(LinkedList<Entity> entities : list) {
//            for(Entity entity : entities) {
//                builder.append(entity.key);
//                builder.append(" = ");
//                builder.append(entity.value);
//                builder.append(" , ");
//            }
//        }
//        builder.append("}");
//
//        return builder.toString();
//    }
//
//    private class Entity {
//        K key;
//        V value;
//
//        public Entity(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//
//}
//class MapUsingHash{
//    private Entity[] entities;
//
//    public MapUsingHash() {
//        entities = new Entity[100];
//    }
//
//    public void put(String key, String value) {
//        int hash = Math.abs(key.hashCode() % entities.length);
//        entities[hash] = new Entity(key, value); // overriding
//    }
//
//    public String get(String key) {
//        int hash = Math.abs(key.hashCode() % entities.length);
//        if(entities[hash] != null && entities[hash].key.equals(key)) {
//            return entities[hash].value;
//        }
//        return null;
//    }
//
//    public void remove(String key) {
//        int hash = Math.abs(key.hashCode() % entities.length);
//        if(entities[hash] != null && entities[hash].key.equals(key)) {
//            entities[hash] = null;
//        }
//    }
//
//    private class Entity {
//        String key;
//        String value;
//
//        public Entity(String key, String value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//}
//public class HashMapImplementation {
//    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Utkrist", 27);
//        map.put("Iker Casillas",1);
//        map.put("Cristiano",7);
//        System.out.println(map.getOrDefault("Utkrist1",99));
//        System.out.println(map.containsKey("Utkrist"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(9);
//        set.add(56);
//        set.add(65);
//        set.add(56);
//        set.add(68);
//        System.out.println(set);
//
//
//        TreeMap<String, Integer> set1 = new TreeMap();
//        set1.put("Utkrist",27);
//        set1.put("Iker Casillas",1);
//        set1.put("Cristiano",7);
//        System.out.println(set1.descendingMap());
//    }
//}
