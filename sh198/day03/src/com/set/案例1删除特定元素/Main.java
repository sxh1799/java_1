package com.set.案例1删除特定元素;

import java.util.ArrayList;

// 删除集合中含有 “枸杞” 的项
/*
* 用的方法时逐个遍历，检查后再删除含有“枸杞”的项
* 但是，每删除一次，集中有的元素的索引就会变化，因此需要注意
* 下面是两种实现方法
* */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> merchandise = new ArrayList<>();
        merchandise.add("宁夏枸杞");
        merchandise.add("山东煎饼");
        merchandise.add("东北鹿茸");
        merchandise.add("内蒙枸杞");
        merchandise.add("吉林人参");

        System.out.println(merchandise);

//        for (int i = 0; i < merchandise.size(); i++) {
//            String s = merchandise.get(i);
//            if(s.contains("枸杞")){
//                merchandise.remove(i);
//                i--;  // 注意
//            }
//        }

        for (int i = merchandise.size() - 1; i >= 0; i--) { // 注意（倒着遍历）
            String s = merchandise.get(i);
            if (s.contains("枸杞")) {
                merchandise.remove(i);
            }
        }
        System.out.println(merchandise);

    }
}
