import { ConsultaBebidasService } from '../../../servicios/consulta-bebidas-servicio/consulta.bebida.service';
import { BebidaDTO } from './../../apoyo/modelo/bebidaDTO';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gestion-bebidas',
  templateUrl: './gestion-bebidas.component.html',
  styleUrls: ['./gestion-bebidas.component.css']
})
export class GestionBebidasComponent implements OnInit {

  public mostrarFormulario: boolean;

  public header: string = "Crear Bebidas";
  public bebida: BebidaDTO;
  public listaBebidas: BebidaDTO[];

  constructor(private bebidaService:ConsultaBebidasService) { }

  ngOnInit() {
    this.listaBebidas = [];
    this.crearBebidaEntity();
    this.consultarBebidas();
  }

  mostrar() {
    this.mostrarFormulario = true;
  }

  ocultar() {
    this.mostrarFormulario = false;
  }

  /**
   * Funcion que se encarga de guardar o actualizar una bebida segun sea el caso.
   */
  public guardar(bebida: BebidaDTO) {
    if (this.header == "Crear Bebidas") {
      this.crearBebida(this.bebida);
    } else {
      this.editarBebida(bebida);
    }
    this.ocultar();
    this.listaBebidas = [];
    this.consultarBebidas();
  }

  /**
   * Función que se encarga de actualizar el objeto bebida para realizar su edición
   */
  public editar(bebida: BebidaDTO) {
    this.header = "Editar Bebida";
    this.bebida = this.listaBebidas[this.listaBebidas.indexOf(bebida)];
    this.mostrar();
  }

  /**
   * Función que llama las funciones de eliminar una bebida tanto graficamente como logicamente.
   */
  public eliminar(bebida: BebidaDTO) {
    this.eliminarBebida(this.listaBebidas[this.listaBebidas.indexOf(bebida)].bebidaId);
    this.listaBebidas.splice(this.listaBebidas.indexOf(bebida), 1);
  }

  /**
   * Función que inicializa una bebida
   */
  public crearBebidaEntity() {
    this.bebida = {
      bebidaId: 1,
      bebidaNombre: '',
      precio: 0,
      }
    }

    /**
     * Función que realiza la peticion de consultar bebidas y actualiza la listaBebidas existete.
     */
    public consultarBebidas(){
      this.bebidaService.consultarBebidas().subscribe(
        bebidas => {
          this.listaBebidas = bebidas;
        },
        error => {
          console.log(error);
        } 
      );
      console.log('resultado servicio.... ' + this.listaBebidas);
    }

    /**
     * Función que realiza la petición de crear una bebida.
     */
    public crearBebida(bebida: BebidaDTO) {
      var bebidaPost = JSON.stringify(bebida);
      console.log(bebidaPost);
      this.bebidaService.crearBebida(bebidaPost).subscribe(
          bebidaCreada => {
            this.crearBebidaEntity();
          },
          error => {
            console.log(error);
          }
        );
    }

    /**
     * Función que realiza la petición de editar una bebida.
     */
    public editarBebida(bebida: BebidaDTO) {
      var bebidaPost = JSON.stringify(bebida);
      console.log(bebidaPost);
      this.bebidaService.editarBebida(bebidaPost).subscribe(
        vehiculoCreado => {
          this.crearBebidaEntity();
        },
        error => {
          console.log(error);
        }
      );
    }

    /**
     * Función que realiza la petición de eliminar una bebida por su Id.
     */
    public eliminarBebida(idbebida) {
      this.bebidaService.eliminarBebida(idbebida).subscribe(
        bebidaEliminada => {

        },
        error => {
          console.log(error);
        }
      );
    }
}


