package Multithreading;
class SharedResource{
    int data;
    boolean hasData;

    public synchronized void produce(int val){
        while(hasData){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data=val;
            System.out.println("Produced : "+val);
            hasData=true;
            notify();

    }
    public synchronized int consumes(){
        while(!hasData){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }    
        hasData=false;
        System.out.println("Consumed : "+ data); 
        notify();        
        return data;
    }
}

class Producer implements Runnable{

    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    
    @Override
    public void run() {
        for(int i =0 ; i<10; i++){
            sharedResource.produce(i);
        }
        
    }
    
}

class Consumer implements Runnable{

    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    @Override
    public void run() {
        for(int i =0 ; i <10 ; i++){
        int val = sharedResource.consumes();
       
    }
        
    }
    
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource));   
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();

    }
}
