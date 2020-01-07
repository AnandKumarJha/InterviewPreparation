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
down latch.
