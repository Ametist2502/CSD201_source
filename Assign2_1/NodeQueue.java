/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign2_1;

/**
 *
 * @author Admin
 */
public class NodeQueue {
    Node value;
    NodeQueue next;

    public NodeQueue() {
    }
    public NodeQueue(Node value){
        this.value = value;
        next = null;
    }
}
