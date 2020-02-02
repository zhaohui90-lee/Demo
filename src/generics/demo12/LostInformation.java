package generics.demo12;

import java.util.*;

public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob,Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<String,Integer> particle = new Particle<>();

        // 在泛型代码内部，无法获取任何有关泛型参数类型的信息
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));// [E]
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));// [K, V]
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));// [Q]
        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));// [POSITION, MOMENTUM]
    }
}
