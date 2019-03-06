# 1 icode一起来刷题
algorithm programming

# 2 目录结构说明
## 2-1 源代码(java实现)
* common: 放一些公用的工具类,如二元组、日期处理等
* algorithm:每人提交的算法代码
* ...

## 2-2 资源及配置
* data-in: 存放算法输入数据
* data-out: 存放算法输出数据
* ```注意：输入数据量不可过大```
 
# 3 代码规范
* 命名：驼峰,见名知意（或添加注释）
* 空格：注意空格,如下：
```java
   package common.bean;
   
   public class Tuple<A, B> {
   
       private A first;
       private B second;
   
       public Tuple() {
       }
   
       public Tuple(A first, B second) {
           this.first = first;
           this.second = second;
       }
   
       public A getFirst() {
           return first;
       }
   
       public void setFirst(A first) {
           this.first = first;
       }
   
       public B getSecond() {
           return second;
       }
   
       public void setSecond(B second) {
           this.second = second;
       }
   }   
``` 
 
# 4 项目成员
* **shiyuquan liunan liusha yinyunyun** 

# 5 后续问题
* 如有补充，请直接提交