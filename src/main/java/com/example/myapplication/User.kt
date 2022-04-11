class User(id:Int,name:String,age:Int){


    var id: Int?=null
    var name: String?=null
    var age: Int?=null

    init{
        this.id = id
        this.name = name
        this.age = age
    }


    fun addUser(){

    }
    fun deleteUser(){

    }
    fun updateUser(name:String,age:Int){
        this.name = name
        this.age = age
    }

}