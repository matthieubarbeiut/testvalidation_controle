class User(){


    var id: Int?=null
    var name: String?=null
    var age: Int?=null


    fun addUser(id:Int,name:String,age:Int){
        this.id = id
        this.name = name
        this.age = age
    }
    fun deleteUser(){
        this.id=null
        this.name = null
        this.age = null
    }
    fun updateUser(name:String,age:Int){
        this.name = name
        this.age = age
    }

}