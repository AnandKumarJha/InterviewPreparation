package com.example.interviewpreparation.design_pattern;

class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

class ThreadSafeSingletonWithStaticBlock {
    private static ThreadSafeSingletonWithStaticBlock instance;
    private ThreadSafeSingletonWithStaticBlock(){}

    public static ThreadSafeSingletonWithStaticBlock getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingletonWithStaticBlock.class) {
                if(instance == null){
                    instance = new ThreadSafeSingletonWithStaticBlock();
                }
            }
        }
        return instance;
    }

}

public class SingletonPattern {
    public static void main(){

    }
}
