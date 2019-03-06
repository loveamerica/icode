
## kmeans算法
**这里放一些算法说明**
### 1 算法解决的问题
* 说明算法的应用背景等
### 2 算法思路
* step1 blabla...
* step2 blabla...
* step3 blabla...
* step4 流程图 eg

```flow 
st=>start: 开始 
e=>end: 登录 
io1=>inputoutput: 输入用户名密码 
sub1=>subroutine: 数据库查询子类 
cond=>condition: 是否有此用户 
cond2=>condition: 密码是否正确 
op=>operation: 读入用户信息

st->io1->sub1->cond 
cond(yes,right)->cond2 
cond(no)->io1(right) 
cond2(yes,right)->op->e 
cond2(no)->io1 
```