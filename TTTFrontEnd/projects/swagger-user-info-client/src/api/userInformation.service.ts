/**
 * TaskTrackingTool API
 * API for showing information about the users.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: viktorzdravkovski995@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@angular/core';
import {
  HttpClient,
  HttpHeaders,
  HttpParams,
  HttpResponse,
  HttpEvent
} from '@angular/common/http';
import { CustomHttpUrlEncodingCodec } from '../encoder';

import { Observable } from 'rxjs';

import { CurrentUserResponse } from '../model/currentUserResponse';

import { BASE_PATH, COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

@Injectable()
export class UserInformationService {
  protected basePath = 'http://localhost:8080/api/v1';
  public defaultHeaders = new HttpHeaders();
  public configuration = new Configuration();

  constructor(
    protected httpClient: HttpClient,
    @Optional() @Inject(BASE_PATH) basePath: string,
    @Optional() configuration: Configuration
  ) {
    if (basePath) {
      this.basePath = basePath;
    }
    if (configuration) {
      this.configuration = configuration;
      this.basePath = basePath || configuration.basePath || this.basePath;
    }
  }

  /**
   * @param consumes string[] mime-types
   * @return true: consumes contains 'multipart/form-data', false: otherwise
   */
  private canConsumeForm(consumes: string[]): boolean {
    const form = 'multipart/form-data';
    for (const consume of consumes) {
      if (form === consume) {
        return true;
      }
    }
    return false;
  }

  /**
   * Get the current logged in user.
   * Get the current logged in user.
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public getCurrentUser(
    observe?: 'body',
    reportProgress?: boolean
  ): Observable<CurrentUserResponse>;
  public getCurrentUser(
    observe?: 'response',
    reportProgress?: boolean
  ): Observable<HttpResponse<CurrentUserResponse>>;
  public getCurrentUser(
    observe?: 'events',
    reportProgress?: boolean
  ): Observable<HttpEvent<CurrentUserResponse>>;
  public getCurrentUser(
    observe: any = 'body',
    reportProgress: boolean = false
  ): Observable<any> {
    let headers = this.defaultHeaders;

    // to determine the Accept header
    let httpHeaderAccepts: string[] = ['application/json'];
    const httpHeaderAcceptSelected:
      | string
      | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
    if (httpHeaderAcceptSelected != undefined) {
      headers = headers.set('Accept', httpHeaderAcceptSelected);
    }

    // to determine the Content-Type header
    const consumes: string[] = [];

    return this.httpClient.get<CurrentUserResponse>(
      `${this.basePath}/user/current-user`,
      {
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress
      }
    );
  }
}
