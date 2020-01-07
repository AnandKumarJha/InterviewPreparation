# InterviewPreparation

# Thread extends
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/ExtendThread.java

# Implements Runnable
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/ImplementRunnable.java

# Count down latch
 A java.util.concurrent.CountDownLatch is a concurrency construct that allows one or more threads to wait for a given set of operations to complete.

A CountDownLatch is initialized with a given count. This count is decremented by calls to the countDown() method. Threads waiting for this count to reach zero can call one of the await() methods. Calling await() blocks the thread until the count reaches zero. 

It is used when we want that a group of thread is completed its task then other thread would start their work. For example we have two develper team 
Dev team A and Dev team B and when these two dev team would finish their task then Testing team C would start their work for that we can use the cound 
down latch.<Br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/CountDownLatchExample.java

# Cyclic Barrier
Cyclic barrier is used when we want to run specific group of thread ater the previous speficic group of thread. For example in cab facility we can see that there are four seat in a cab when the 4 passangers come then cab starts and drop the passanger to the destination and after that he/she again follow the same procedure.<br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/CyclicBarrierExample.java

# Semaphore
Semaphore is the new class introduces as a part of concurrency package in JDK 1.5. It maintains a set of permits which get acquired by thread before using some functionality.
It is a technique to protect your critical resource from being used by more then 'N' threads simulaneously. Semaphore maintains number of available permits. Whenever a thread wants to used some shared resource, maintained by samaphore. It asks semaphore for the permit. If permit is available thread can use the shared resource, otherwise it will wait till some other thread release the permits or come out without using the shared resource.

## Scanerio
1. To implement better database connection pool which will block if no more connection is available instead of failing and handover connection as soon as its available.
2. To put a bound on collection classes by using semaphore you can implement bounded collection whose bound is specified by counting semaphore.<br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/SemaphoreExample.java

 The java.util.concurrent.Semaphore class is a counting semaphore. That means that it has two main methods:

    acquire()
    release()

The counting semaphore is initialized with a given number of "permits". For each call to acquire() a permit is taken by the calling thread. For each call to release() a permit is returned to the semaphore. Thus, at most N threads can pass the acquire() method without any release() calls, where N is the number oFairness
 
## Fairness
No guarantees are made about fairness of the threads acquiring permits from the Semaphore. That is, there is no guarantee that the first thread to call acquire() is also the first thread to obtain a permit. If the first thread is blocked waiting for a permit, then a second thread checking for a permit just as a permit is released, may actually obtain the permit ahead of thread 1.

If you want to enforce fairness, the Semaphore class has a constructor that takes a boolean telling if the semaphore should enforce fairness. Enforcing fairness comes at a performance / concurrency penalty, so don't enable it unless you need it.

Here is how to create a Semaphore in fair mode:

Semaphore semaphore = new Semaphore(1, true);


# Thread priority
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/ThreadPriority.java

# Volatile keyword
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/VolatileKeyword.java

# ThreadPoolExecutor
 The java.util.concurrent.ThreadPoolExecutor is an implementation of the ExecutorService interface. The ThreadPoolExecutor executes the given task (Callable or Runnable) using one of its internally pooled threads.

The thread pool contained inside the ThreadPoolExecutor can contain a varying amount of threads. The number of threads in the pool is determined by these variables:

    corePoolSize
    maximumPoolSize

If less than corePoolSize threads are created in the the thread pool when a task is delegated to the thread pool, then a new thread is created, even if idle threads exist in the pool.

If the internal queue of tasks is full, and corePoolSize threads or more are running, but less than maximumPoolSize threads are running, then a new thread is created to execute the task.<br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/ThreadPoolExecutorExample.java

# Synchronised function and blocks
When we have critical resources that is bieng shared among multiple resources in that case the data is tempored. To prevent this condition we uses synchronised keyword. Synchronised blocks have good performance over synchronised function.<br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/SynchronisedBlock.java<br />
https://github.com/AnandKumarJha/InterviewPreparation/blob/master/app/src/main/java/com/example/interviewpreparation/thread/SynchronisedExample.java

# Producer Consumer Problem
https://github.com/AnandKumarJha/InterviewPreparation/tree/master/app/src/main/java/com/example/interviewpreparation/thread
