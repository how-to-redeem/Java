package qqqq;

import java.util.HashMap;
import java.util.Map;

    public class www {

        public static void main(String[] args) {
            String word = "hello tom\n" +
                    "hello rose\n" +
                    "hello jerry\n" +
                    "hello TBL\n" +
                    "hello tom\n" +
                    "hello kitty\n" +
                    "hello rose\n" +
                    "hello TBL\n" +
                    "hello ZDP\n" +
                    "hello ZDP\n" +
                    "hello TBL";
            //创建HashMap对象
            Map<String, Integer> map = new HashMap<String,Integer>();
            //将word以“\n”拆分
            String[] split = word.split("\n");
            //把拆分后的字符串数组循环取出
            for (String w:split) {
                //取出每个元素在意 空格拆分，返回的右是一个字符串数组
                String[] split1 = w.split(" ");
                //循环把split1里元素取出来
                for (int i = 0; i <split1.length ; i++) {
                    //判断是否包含指定的键名
                    if (map.containsKey(split1[i])){
                        Integer integer = map.get(split1[i]);
                        integer++;
                        map.put(split1[i],integer);
                    }
                    if (!map.containsKey(split1[i])){
                        map.put(split1[i],1);
                    }

                }
            }
            for (Map.Entry<String,Integer> m:map.entrySet()) {
                System.out.println(m.getKey() + " : " + m.getValue() );
            }
            System.out.println("---------------------");
            //第二种
            for (String key:map.keySet()) {
                System.out.println("key= " + key);
            }
            for (Integer value:map.values()) {
                System.out.println("value= " + value);
            }
            System.out.println("-------------------");
            //第三种
            for (String key1 : map.keySet()) {
                Integer value1 = map.get(key1);
                System.out.println(key1 + " : " + value1);

            }

        }
    }


