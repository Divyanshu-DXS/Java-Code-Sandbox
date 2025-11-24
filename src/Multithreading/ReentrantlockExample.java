package Multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLockExample {
    Lock lock = new ReentrantLock();

    public void outterMethod(){
        lock.lock();
       try{ 
        System.out.println("outter method");
        innerMethod();
        }
        catch(Exception e){

        }
        finally{
            lock.unlock();
        }

    }

    public void innerMethod(){
        lock.lock();
        try{
        System.out.println("Inner Metthod");
    }
    catch(Exception e){

    }
    finally{
        lock.unlock();
    }
    }
    
}
