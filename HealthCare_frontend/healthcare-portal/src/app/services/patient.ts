// src/app/services/patient.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patient } from '../shared/models/patient.model';

@Injectable({ providedIn: 'root' })
export class PatientService {
  private baseUrl = 'http://localhost:6061/api/patients';
  constructor(private http: HttpClient) {}
  getAll(): Observable<Patient[]> { return this.http.get<Patient[]>(this.baseUrl); }
  getById(id: number): Observable<Patient> { return this.http.get<Patient>(`${this.baseUrl}/${id}`); }
  create(patient: Patient): Observable<Patient> { return this.http.post<Patient>(this.baseUrl, patient); }
}
