import java.awt.*;
import java.io.*;
/* Object ที่ต้องการจะSave */
class Box implements Serializable {
  /* แก้โดยเอาค่า SUID เก่ามาใส่ด้วย >> color ยังไม่ได้ define = null */
  //private static final long serialVersionUID = 4628194088373291609L;
  private int width, height, depth; /* Ver1: 3 Attributes */
  //private Color color;
  /* Verใหม่จะError >> Exception: java.io.InvalidClassException:
   * Box; local class incompatible: stream serialVersionUID = 4628194088373291609,
   * local class serialVersionUID = -390106362749067067 */

  //public Box(int width, int height, int depth, Color color) {
  public Box(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
    //this.color = color;
  }

  public String toString() {
    //return "[" + width + "," + height + "," + depth + "," + color + "]";
    return "[" + width + "," + height + "," + depth + "]";
  }
}
