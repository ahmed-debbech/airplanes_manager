import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Airplane } from './airplane';
import { AirplanesService } from './airplanes.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'airplanes-manager';
  public airplanes: Airplane[] = [];

  constructor(private airplanesService: AirplanesService){
  
  }
  ngOnInit(): void {
    this.getAirplanes();
  }
  public getAirplanes(){
    this.airplanesService.getAirplanes().subscribe(
      (response: Airplane[]) => {
        this.airplanes = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
}
