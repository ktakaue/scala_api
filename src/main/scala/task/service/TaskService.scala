// task.serviceとしてモジュール化している
// こうすることで他の箇所でimport task.service.TaskServiceとして使える
package task.service

// I/Oを非同期に扱うためのライブラリ？
import cats.effect.IO
import task.model.Task
import java.util.UUID

// ここで実際に使うメソッドを定義している
// TaskService.getTask(taskId)みたいな感じで使う
trait TaskService{
    // 単一のTaskを取得する
    def getTask(id: UUID): IO[Option[Task]]
    // Taskのリストを取得する
    def getTasks: IO[List[Task]]
    // Taskを作成する
    def createTask(task: Task): IO[Task]
    // Taskを更新する
    def updateTask(id: UUID, task: Task): IO[Option[Task]]
    // Taskを削除する
    def deleteTask(id: UUID): IO[Unit]
}



