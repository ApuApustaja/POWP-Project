import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  fabryki$: Observable<Array<any>>
  linie$: Observable<Array<any>>
  maszyny$: Observable<Array<any>>
  maszynyInfo$: Observable<Array<any>>
  daneUnpack;
  valueFab;
  valueLin;
  valueMan;

  constructor(private httpClient: HttpClient){}

  ngOnInit(){
    this.getFabryka()
    this.fabryki$.subscribe(res => console.log(res));
  }
  

  APILink = 'http://localhost:8080/api/factory/all'
  ApiLinkMaszyny = 'http://localhost:8080/api/linemachines/all'
  ApiLinkLinie = 'http://localhost:8080/api/factorylines/all'
  // APILink = 'http://api.nbp.pl/api/exchangerates/tables/A/'

  title = 'POWP-front';

  getFabryka(): Observable<Array<any>> {
     return this.fabryki$ =  this.httpClient.get<Array<any>>(this.APILink)
  }

  getLinia(): Observable<Array<any>> {
    console.log(this.valueFab);
    return this.linie$ =  this.httpClient.get<Array<any>>(this.ApiLinkLinie + '/id?id=' + this.valueFab)
   }

   getMaszyny(): Observable<Array<any>> {
    return this.maszyny$ =  this.httpClient.get<Array<any>>(this.ApiLinkMaszyny + '/id?id=' + this.valueLin)
   }

   getMaszynyInfo(): Observable<Array<any>> {
    return this.maszynyInfo$ =  this.httpClient.get<Array<any>>(this.ApiLinkMaszyny + '/id?id=' + this.valueMan)
   }


}
