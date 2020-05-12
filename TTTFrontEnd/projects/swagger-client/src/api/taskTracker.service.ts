/**
 * TaskTrackingTool API
 * API for Fetching, Saving, Updating and Deleting tasks
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

import { AddTaskConfirmation } from '../model/addTaskConfirmation';
import { AddTaskRequestBody } from '../model/addTaskRequestBody';
import { DeleteTaskConfirmation } from '../model/deleteTaskConfirmation';
import { Task } from '../model/task';

import { BASE_PATH, COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

@Injectable()
export class TaskTrackerService {
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
   * Add a task
   * Add a new task in database
   * @param body
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public addTask(
    body: AddTaskRequestBody,
    observe?: 'body',
    reportProgress?: boolean
  ): Observable<AddTaskConfirmation>;
  public addTask(
    body: AddTaskRequestBody,
    observe?: 'response',
    reportProgress?: boolean
  ): Observable<HttpResponse<AddTaskConfirmation>>;
  public addTask(
    body: AddTaskRequestBody,
    observe?: 'events',
    reportProgress?: boolean
  ): Observable<HttpEvent<AddTaskConfirmation>>;
  public addTask(
    body: AddTaskRequestBody,
    observe: any = 'body',
    reportProgress: boolean = false
  ): Observable<any> {
    if (body === null || body === undefined) {
      throw new Error(
        'Required parameter body was null or undefined when calling addTask.'
      );
    }

    let headers = this.defaultHeaders;

    // to determine the Accept header
    let httpHeaderAccepts: string[] = [];
    const httpHeaderAcceptSelected:
      | string
      | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
    if (httpHeaderAcceptSelected != undefined) {
      headers = headers.set('Accept', httpHeaderAcceptSelected);
    }

    // to determine the Content-Type header
    const consumes: string[] = ['application/json'];
    const httpContentTypeSelected:
      | string
      | undefined = this.configuration.selectHeaderContentType(consumes);
    if (httpContentTypeSelected != undefined) {
      headers = headers.set('Content-Type', httpContentTypeSelected);
    }

    return this.httpClient.post<AddTaskConfirmation>(
      `${this.basePath}/task-tracker/task`,
      body,
      {
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress
      }
    );
  }

  /**
   * Delete a task
   * Delete a task
   * @param id id of task
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public deleteTask(
    id: string,
    observe?: 'body',
    reportProgress?: boolean
  ): Observable<DeleteTaskConfirmation>;
  public deleteTask(
    id: string,
    observe?: 'response',
    reportProgress?: boolean
  ): Observable<HttpResponse<DeleteTaskConfirmation>>;
  public deleteTask(
    id: string,
    observe?: 'events',
    reportProgress?: boolean
  ): Observable<HttpEvent<DeleteTaskConfirmation>>;
  public deleteTask(
    id: string,
    observe: any = 'body',
    reportProgress: boolean = false
  ): Observable<any> {
    if (id === null || id === undefined) {
      throw new Error(
        'Required parameter id was null or undefined when calling deleteTask.'
      );
    }

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

    return this.httpClient.delete<DeleteTaskConfirmation>(
      `${this.basePath}/task-tracker/task/${encodeURIComponent(String(id))}`,
      {
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress
      }
    );
  }

  /**
   * Return a task by id
   * Fetch a task by id
   * @param id id of task
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public getTask(
    id: string,
    observe?: 'body',
    reportProgress?: boolean
  ): Observable<Task>;
  public getTask(
    id: string,
    observe?: 'response',
    reportProgress?: boolean
  ): Observable<HttpResponse<Task>>;
  public getTask(
    id: string,
    observe?: 'events',
    reportProgress?: boolean
  ): Observable<HttpEvent<Task>>;
  public getTask(
    id: string,
    observe: any = 'body',
    reportProgress: boolean = false
  ): Observable<any> {
    if (id === null || id === undefined) {
      throw new Error(
        'Required parameter id was null or undefined when calling getTask.'
      );
    }

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

    return this.httpClient.get<Task>(
      `${this.basePath}/task-tracker/task/${encodeURIComponent(String(id))}`,
      {
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress
      }
    );
  }

  /**
   * Returns a list of tasks.
   * Fetch all tasks from database.
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public getTasks(
    observe?: 'body',
    reportProgress?: boolean
  ): Observable<Array<Task>>;
  public getTasks(
    observe?: 'response',
    reportProgress?: boolean
  ): Observable<HttpResponse<Array<Task>>>;
  public getTasks(
    observe?: 'events',
    reportProgress?: boolean
  ): Observable<HttpEvent<Array<Task>>>;
  public getTasks(
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

    return this.httpClient.get<Array<Task>>(
      `${this.basePath}/task-tracker/task`,
      {
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress
      }
    );
  }
}
