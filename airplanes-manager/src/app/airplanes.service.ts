import { Observable } from "rxjs";
import { HttpClient} from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Airplane } from "./airplane";
import { environment } from "src/environments/environment";

@Injectable({
    providedIn: 'root'
})
export class AirplanesService{
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient){

    }

    public getAirplanes(): Observable<Airplane[]>{
        return this.http.get<Airplane[]>(`${this.apiServerUrl}/airplane/getall`);
    }
    public addAirplanes(airplane: Airplane): Observable<Airplane>{
        return this.http.post<Airplane>(`${this.apiServerUrl}/airplanes/add`, airplane);
    }
    public updateAirplanes(airplane: Airplane): Observable<Airplane>{
        return this.http.put<Airplane>(`${this.apiServerUrl}/airplanes/update`, airplane);
    }
    public deleteAirplanes(id: number){
        return this.http.delete<void>(`${this.apiServerUrl}/airplanes/delete/${id}`);
    }
}