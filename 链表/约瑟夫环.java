package 链表;

public class 约瑟夫环 {
	public static void main(String[] args) {
		CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
		circleSingleLinkedList.addBoy(5);
//		circleSingleLinkedList.showBoy();  
		
		System.out.println(circleSingleLinkedList.countBoy(3, 5));
	}
}

//定义一个循环单链表类
class CircleSingleLinkedList{
 Boy first = null;
 public void addBoy(int nums){
     Boy curBoy = null;
     if(nums < 1){
//         System.out.println("输入的nums异常！");
         return;
     }
     for(int i=0;i<=nums-1;i++){
         Boy boy = new Boy(i);
         if(i == 0){
             first = boy;
             first.setNext(first);
             curBoy = first;
         }else{
//             first.setNext(boy);
//             curBoy = curBoy.getNext();
//             curBoy.setNext(first);
         	curBoy.setNext(boy);
         	curBoy = curBoy.getNext();
         	curBoy.setNext(first);
         }
     }
 }
 
// public void showBoy() {
// 	if (first == null) {
//			System.out.println("链表为空");
//			return;
//		}
// 	Boy curBoy = first;
// 	while(true) {
// 		System.out.printf("小孩的编号是%d\n",curBoy.getNo());
// 		if (curBoy.getNext() == first) {
//				break;
//			}
// 		curBoy = curBoy.getNext();
// 	}
// }
 
 public int countBoy(int countNum,int nums) {
 	if(first == null) {
 		System.out.println("链表不存在！");
 		return 0;
 	}
 	// 创建一个辅助指针helperBoy
 	Boy helperBoy = first;	
 	// 让辅助指针helperBoy指向链表的结尾
 	while(true) {
 		if (helperBoy.getNext() == first) {
				break;
			}
 		helperBoy = helperBoy.getNext();
 	}
 	
 	while(true) {
 		if(first == helperBoy) {
 			break;
 		}
 		for (int i = 0; i < countNum-1; i++) {
				first = first.getNext();
				helperBoy = helperBoy.getNext();
			}
// 		System.out.printf("出队编号%d\n",first.getNo());
 		first = first.getNext();
 		helperBoy.setNext(first);
 	}
 	return first.getNo();
 }

}
//定义一个单链表类Boy
class Boy{
 private int no;
 private Boy next;
 public Boy(){

 }
 public Boy(int no){
     this.no = no;
 }
 public void setNo(int no){
     this.no = no;
 }
 public int getNo(){
     return no;
 }
 public Boy getNext(){
     return next;
 }
 public void setNext(Boy next){
 	this.next = next;
 }
 
}