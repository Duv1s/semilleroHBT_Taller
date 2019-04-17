import { BebidaDTO } from '../../capa/apoyo/modelo/bebidaDTO';
import { Injectable, Injector } from '@angular/core';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { AbstractService } from '../template.service';

@Injectable({
    providedIn: 'root'
})

export class ConsultaBebidasService extends AbstractService {
    public bebida: BebidaDTO;
    public listaBebidaDTO: BebidaDTO[];

    constructor(injector: Injector) {
        super(injector);
    }

    /**
     * Función que realiza la petición que consulta la lista de bebidas almacenadas en la bse de datos.
     */
    public consultarBebidas(): Observable<BebidaDTO[]> {
        {
            return this.get<BebidaDTO[]>("/semillero-servicios", "/ConsultasRest/consultarBebidas", {});
        }
    }

    
    /**
     * Función que realiza la petición para almacenar una bebida en la base de datos.
     */
    public crearBebida(bebida: string): Observable<any> {
        {
            return this.post<string>("/semillero-servicios", "/ConsultasRest/crearBebida", bebida);
        }
    }

    
    /**
     * Función que realiza la petición para editar una bebida en la base de datos.
     */
    public editarBebida(bebida: string): Observable<any> {
        {
            return this.post<string>("/semillero-servicios", "/ConsultasRest/editarBebida", bebida);
        }
    }
    
    /**
     * Función que realiza la petición para eliminar una bebida de la base de datos por id.
     */
    public eliminarBebida(bebidaID: string): Observable<BebidaDTO[]> {
        {
            return this.get<BebidaDTO[]>("/semillero-servicios", "/ConsultasRest/eliminarBebida",
                {
                    "idBebida": bebidaID,
                });
        }
    }
}