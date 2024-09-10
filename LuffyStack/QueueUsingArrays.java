class MyQueue {
  int front, rear;
	int arr[] = new int[100005];
  MyQueue()	{
		front=0;
		rear=0;
	}
	void push(int x)	{
	    if(rear != arr.length){
	        arr[rear++] = x;
      }
	} 

  int pop(){
		if(front != rear){
		    return arr[front++];
		} else {
		    return -1;
		}
	} 
}
