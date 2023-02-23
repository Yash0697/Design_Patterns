A command object encapsulates a request to do something (like turn on a light) on a specifixc object.

Command pattern allows you to decouple the requester of an action from the object that actually performs the action

Command pattern encapsulates a request as an object, thereby letting you parameterize other objects with different
requests, queue, or log requests, and support undoable operations

So, there are three types of objects:
1. Requester of an action
2. Command object
3. Invoker
3. Vendor or Receiver that performs the action