type Vehiculo = {
    Marca : string
    Modelo: string
    Velocidad: int
}

let acelerar incremento vehiculo =
    { 
        vehiculo with Velocidad = vehiculo.Velocidad + incremento 
    }

let frenar decremento vehiculo =
    let nuevaVelocidad = max 0 (vehiculo.Velocidad - decremento)
    {
        vehiculo with Velocidad = nuevaVelocidad
    }

let mostrar vehiculo =
    printfn "Vehículo: %s %s - Velocidad: %d km/h" vehiculo.Marca vehiculo.Modelo vehiculo.Velocidad

let carro = { Marca = "Toyota"; Modelo = "Corolla"; Velocidad = 0 }

carro
|> acelerar 50
|> frenar 20
|> mostrar