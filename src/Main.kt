fun main() {
    //
    var r2d2Pos: List<Int>
    r2d2Pos= arturito(10,5,-2)
    println("x: ${r2d2Pos[0]}, y: ${r2d2Pos[1]}, direccion: ${mostrarDireccion(r2d2Pos[2])}")

    r2d2Pos= arturito(0,0,0)
    println("x: ${r2d2Pos[0]}, y: ${r2d2Pos[1]}, direccion: ${mostrarDireccion(r2d2Pos[2])}")

    r2d2Pos= arturito()
    println("x: ${r2d2Pos[0]}, y: ${r2d2Pos[1]}, direccion: ${mostrarDireccion(r2d2Pos[2])}")

    r2d2Pos= arturito(-10,-5,2)
    println("x: ${r2d2Pos[0]}, y: ${r2d2Pos[1]}, direccion: ${mostrarDireccion(r2d2Pos[2])}")

    r2d2Pos= arturito(-10,-5,2,4,-8)
    println("x: ${r2d2Pos[0]}, y: ${r2d2Pos[1]}, direccion: ${mostrarDireccion(r2d2Pos[2])}")
}
fun arturito(vararg move: Int): List<Int> {
    var ejeX = 0
    var ejeY = 0
    var direc = 0 //0 => POSITIVEY; 1 => NEGATIVEX; 2 => NEGATIVEY; 3 => POSITIVEX

    for (pasos in move) {
        when (direc){
            0-> ejeY += pasos
            1-> ejeX -= pasos
            2-> ejeY -= pasos
            3-> ejeX += pasos
        }
        if (direc==3) direc = 0 else direc +=1
    }
    return listOf(ejeX,ejeY,direc)
}
fun mostrarDireccion(direc:Int):String{
    return when (direc){
        0-> "POSITIVEY"
        1-> "NEGATIVEX"
        2-> "NEGATIVEY"
        3-> "POSITIVEX"
        else -> ""
    }
}