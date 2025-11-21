# Transaction Management 

### What is a Transaction ? 

“A controlled block of operations that act as one single unit.”

### Why Spring Needs @Transactional
    
Whenever you perform operations like:
    
    Saving multiple entities
    Updating multiple tables
    Using JPA/Hibernate (which queues operations)
    Calling multiple repository methods
   
You need Spring to guarantee consistency.
   
@Transaction gives you:
   
    Automatic begin   
    Automatic commit   
    Automatic rollback   
    Safety around errors
    DB integrity
   
Without it, you’d manually manage commits/rollbacks (ugly + error-prone).

### ACID Properties 

ACID guarantees that data is consistent, predictable, and safe — even under failures, crashes, or simultaneous users.


Transactions guarantee the ACID properties: <br>
Every transaction system is built on A.C.I.D.: 

- <u>Atomicity</u>: all or nothing 
    - for instance a transaction consisting of 5 operations, must complete all, or do none 
- <u>Consistency</u>: Data stays preserved, valid before and after 
    - Consistency means your database should never end up in an invalid or “broken” state.
- <u>Isolation</u>: Transactions should not interfere with each other.
    - Imagine two people editing the same Google Doc. 
      Without proper isolation → they overwrite each other.
     - Isolation ensures:
       No dirty reads / No inconsistent reads / No phantom reads 
- <u>Durability</u>: once committed, data stays safe
     - Durability ensures committed data survives any failure.

### Spring Transaction Management (How It Works)

Spring provides Declarative Transaction Management using:
>> @Transactional
: This annotation is your key tool.

Spring wraps your service class in a dynamic proxy:
>> Steps:

    - Your controller calls your service method
    - The call goes through Spring’s proxy
    - Proxy starts a transaction
    - Your method executes
    - If no exception → commit
    - If exception → rollback

This is why:
@Transactional works only on public methods

@Transactional does not work on self-invocation
(method calling method inside same class bypasses proxy)

You can apply it to:

- A method
- A class
- A service layer

### Rollback Rules (Important)
    
Spring rolls back on: 
        
       ✔️ RuntimeException
       ✔️ Error
Spring does not roll back on checked exceptions unless configured.


### Propagation 

What happens when another @Transactional gets called inside a @Transactional 

- Super common in real world systems. 

Spring gives 7 propagation behaviours
Amongst which these below 3 are the most common to come across .. 
- Required 
- Requires_New
- Nested 

#### Required (Default)
This usually means, that if a 'Transaction' is running then to join it... 
if no transaction is running then to create a new one.. 

in this case lets say 
>> @Transactional MethodA() -> calls @Transactional MethodB()

They run in one single transaction.
And in this case the transaction inside methodB fails.. 
then the Method B will RollBack and so shall Method A 

#### Requires_New 
This behaviour means, that a new transaction is always requested, and it does not join with the existing transaction
It suspends any existing transaction 

in this case lets say 
>> @Transactional MmethodA() -> calls @Transactional MethodB()

If method B fails, it does not affect method A .. 
If method A fails, it does not impact method B .. 
Since method B requests an independent transaction 

Real-world use:

    Logging service
    Audit service
    Sending notifications
    Outbox pattern

These must succeed even if the main business call fails.

#### Nested
This kind of creates a savepoint inside a nested transaction and what it does is .. 
Rollback affects only the nested part, not the parent 

Note: Works only with specific DBs that support savepoints (some don’t).


### Isolation Levels 
Isolation controls how transactions see each other’s data when many users access the DB at the same time.

1. READ_UNCOMMITTED : 
    - Allows dirty reads.
    - You can see data that another transaction hasn’t committed yet.
    - Terrible for consistency.
2. READ_COMMITTED (most common) | Most apps use this.
    - Prevents dirty reads.
    - You only see committed data.
  - Still allows:
    - Non-repeatable reads  
    - Phantom reads
3. REPEATABLE_READ : 
 - Prevents:
    - Dirty reads
    - Non-repeatable reads
    - You will see the same result when rereading the same row inside a transaction.
    - Phantom reads may still happen.
4. SERIALIZABLE : 
    - Transactions execute one after another.
    - No reading inconsistencies.
    - Strong consistency.
    - Worst performance.

