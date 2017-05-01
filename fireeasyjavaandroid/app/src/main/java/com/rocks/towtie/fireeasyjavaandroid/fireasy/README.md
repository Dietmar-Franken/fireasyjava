# Usage

### Authorization
##### Add User

> createNewUser(Activity activity, FirebaseAuth mAuth, String email, String password ) 

* Create a new user. Logs message on success or failure. Can check your authorization sessions for null to check.

> signInUser(Activity activity, FirebaseAuth mAuth,  String email, String password )

* Sign an existing user in. Logs message on success or failure. Can check your authorization sessions for null to check.

> deleteUser(FirebaseAuth mAuth)

* After authentication a user, delete the current user.

> sendPasswordResetEmail(FirebaseAuth mAuth, String email)

* Sends a user a password reset email. This message can be edited.

### Database

##### Add Data

> addData(DatabaseReference dRef, String parent, String newChild)

> updateData(DatabaseReference dRef, String parent, Map<String,Object> addData )