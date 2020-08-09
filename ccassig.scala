case class point(x:Int,y:Int){
  def +(addpoint:point)=point(x+addpoint.x,y+addpoint.y)
  def move(dx:Int,dy:Int)= new point(this.x+dx,this.y+dy)
  def distance(p:point):Double={
    var i=this.x-p.x
    var j=this.y-p.y
    var total=i*i+j*j
    var dis= math.pow(total,0.5)
    return dis
  }
  def invert()=new point(y,x)
}

object ccassig extends App{
    val p1=new point(10,5)
    val p2=new point(9,2)
    println(p1+p2)
    println(p1.move(5,5))
    println(p1.distance(p2))
    println(p2.invert())
}

