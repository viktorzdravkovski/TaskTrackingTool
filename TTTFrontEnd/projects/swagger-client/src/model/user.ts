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
import { Comment } from './comment';


export interface User { 
    id?: number;
    fullName: string;
    email: string;
    username: string;
    address?: string;
    dateOfBirth?: string;
    createdAt?: Date;
    comments?: Array<Comment>;
}
