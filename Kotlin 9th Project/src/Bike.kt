class Bike(model_Name:String, color_Name:String, type_name:String):product(model_Name,color_Name,type_name) {
    fun info(){
        println("Brand is: $model, color is: $color, type is: $type")
    }
}