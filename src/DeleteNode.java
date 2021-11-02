
/**
 * 请编写一个函数，用于 删除单链表中某个特定节点 。在设计函数时需要注意，你无法访问链表的头节点 head ，只能直接访问 要被删除的节点 。
 *
 * 题目数据保证需要删除的节点 不是末尾节点 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}

    //添加新的节点
    public void add(int val) {
        ListNode newListNode = new ListNode(val);
        if (this.next == null) {
            this.next = newListNode;
        } else {
            this.next.add(val);
        }
    }

    //在不知道头节点的情况下删除固定节点
    public void deleteNode(ListNode node) {
        //node.val = node.next.val;
        //node.next = node.next.next;
        while(true){
            if(node.next.next!=null){
                node.val = node.next.val;
                node = node.next;
            }else{
                node.val = node.next.val;
                node.next = null;
                break;
            }
        }
    }

    //为了得到目标节点写的函数
    public ListNode getTargetNode(ListNode listNode,int val){
        while (true){
            if (listNode.val == val){
                return listNode;
            }else {
                listNode = listNode.next;
            }
        }
    }

    //测试结果
    public void print(){
        System.out.print(this.val);
        if (this.next != null){
            System.out.print("-->");
            this.next.print();
        }
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        int[] head = {4,5,1,9};
        int node = 1;
        int length = head.length;
        ListNode headList = new ListNode(head[0]);
        for(int i = 1;i<length;i++){
            headList.add(head[i]);
        }
        ListNode targetNode = headList.getTargetNode(headList,node);
        headList.deleteNode(targetNode);
        headList.print();
    }
}
