class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodesInB=new HashSet<>();
        while(headB!=null){
            nodesInB.add(headB);
            headB=headB.next;
        }
        
        while(headA!=null){            
            if(nodesInB.contains(headA) != false){
                return headA;
            }
            headA=headA.next;
        }
        return null;        
    }
}