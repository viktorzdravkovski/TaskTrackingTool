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
import { User } from './user';


export interface Task { 
    id?: number;
    name?: string;
    description?: string;
    assignedUsers?: Array<User>;
    comments?: Array<Comment>;
}
