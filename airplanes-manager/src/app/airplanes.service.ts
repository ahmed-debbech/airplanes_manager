import { Observable } from "rxjs";
import { HttpClient} from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Airplane } from "./airplane";

@Injectable({
    providedIn: 'root'
})
export class AirplanesService{
    private apiServerUrl = '';

    constructor(private http: HttpClient){

    }

    public getAirplanes(): Observable<Airplane[]>{
        return this.http.get<Airplane[]>(`${this.apiServerUrl}/airplanes/getall`);
    }
}